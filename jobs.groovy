job('dsl_lein_job') {
    scm {
        git{
          remote {
            name('origin')
            url('https://github.com/talios/clojure-lounge-lein-example.git')
          }
          branch('master')
          extensions {
            wipeOutWorkspace()
            localBranch('master')
          }
        }
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell('echo START')
        leiningenBuilder {
            task('deps')
            subdirPath('')

          }
    }
}
