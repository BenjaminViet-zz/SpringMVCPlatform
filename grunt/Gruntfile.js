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
                files: {"../web/src/main/webapp/themes/white-black/clientstyle/css/dev/style.css": "../web/src/main/webapp/themes/white-black/clientstyle/less/*.less"}
            },
            production: {
                options: {
                    paths: ["../web/src/main/webapp/themes"],
                    compress: true
                },
                files: {"../web/src/main/webapp/themes/white-black/clientstyle/css/pro/style.min.css": "../web/src/main/webapp/themes/white-black/clientstyle/less/*.less"}
            }
        },

        /*
         * Watch task configuration
         */
        watch: {
            less: {
                files: [
                    '../web/src/main/webapp/themes/white-black/clientstyle/less/*.less' // <== Write here the files that Grunt must watches
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