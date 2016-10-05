module.exports = function(grunt) {

    // Load automatically all tasks without using grunt.loadNpmTasks()
    // for each module
    require('load-grunt-tasks')(grunt);

    grunt.initConfig({

        /*
         * LESS task configuration
         */
        less: {
            development: {
                options: {
                    paths: ["../web/src/main/webapp/themes"]
                },
                files: {
                    "../web/src/main/webapp/sc-content/css/dev/clientstyle.css": "../web/src/main/webapp/themes/client/white-black/less/clientstyle.less",
                    "../web/src/main/webapp/sc-content/css/dev/adminstyle.css": "../web/src/main/webapp/themes/admin/less/adminstyle.less"
                }
            },
            production: {
                options: {
                    paths: ["../web/src/main/webapp/themes"],
                    compress: true
                },
                files: {
                    "../web/src/main/webapp/sc-content/css/pro/clientstyle.min.css": "../web/src/main/webapp/themes/client/white-black/less/clientstyle.less",
                    "../web/src/main/webapp/sc-content/css/pro/adminstyle.min.css": "../web/src/main/webapp/themes/admin/less/adminstyle.less"
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
        }
    });


    /*
     * Registered tasks
     */
    grunt.registerTask('default', ['less']);

};