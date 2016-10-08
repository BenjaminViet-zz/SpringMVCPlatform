module.exports = function(grunt) {

    // Load automatically all tasks without using grunt.loadNpmTasks()
    // for each module
    require('load-grunt-tasks')(grunt);

    grunt.initConfig({

        /*
         * LESS task configuration
         */
        less: {
            dev: {
                options: {
                    paths: ["../web/src/main/webapp/themes"]
                },
                files: {
                    "../web/src/main/webapp/dist/dev/css/clientstyle.css": "../web/src/main/webapp/themes/client/white-black/less/clientstyle.less",
                    "../web/src/main/webapp/dist/dev/css/adminstyle.css": "../web/src/main/webapp/themes/admin/less/adminstyle.less"
                }
            },
            pro: {
                options: {
                    paths: ["../web/src/main/webapp/themes"],
                    compress: true
                },
                files: {
                    "../web/src/main/webapp/dist/pro/css/clientstyle.min.css": "../web/src/main/webapp/themes/client/white-black/less/clientstyle.less",
                    "../web/src/main/webapp/dist/pro/css/adminstyle.min.css": "../web/src/main/webapp/themes/admin/less/adminstyle.less"
                }
            }
        },

        /*
         * Watch task configuration
         */
        watch: {
            less: {
                files: [
                    '../web/src/main/webapp/themes/**/*.less' // <== Write here the files that Grunt must watches
                ],
                tasks: ['less']
            }
        },
        concat: {
            dev: {
                options: {
                    // Replace all 'use strict' statements in the code with a single one at the top
                    banner: "'use strict';\n",
                    separator: ';\n',
                    process: function(src, filepath) {
                        return '// Source: ' + filepath + '\n' +
                            src.replace(/(^|\n)[ \t]*('use strict'|"use strict");?\s*/g, '$1');
                    }
                },
                src: ["../web/src/main/webapp/script-modules/AdminLTE.js","../web/src/main/webapp/script-modules/adminJS.js"],
                dest: "../web/src/main/webapp/dist/dev/js/adminJS.js"
            }
        }
    });


    /*
     * Registered tasks
     */
    grunt.registerTask('default', ['less:dev', 'concat:dev']);
    grunt.registerTask('pro', ['less:pro']);

};