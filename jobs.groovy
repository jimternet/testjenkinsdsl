job('dsl_lein_job') {
    scm {
        git('https://github.com/talios/clojure-lounge-lein-example.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell('echo START')
        leiningenBuilder {
            task('deps')
          }
    }
}
