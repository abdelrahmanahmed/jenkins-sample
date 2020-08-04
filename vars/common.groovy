def call(boolean deploy ) {
    pipeline {
    agent any
        stage('detect branch') {
            steps {
          script{
               if (env.BRANCH_NAME.equals('master') ){
                   
               echo "hello master"
            }
            else if(env.BRANCH_NAME.equals('develop')){
              echo "hello develop"
            }
               }

        
          }
        }
        stage("Deploy") {
            if (deploy) {
                sh "npm publish"
            }
        }
    
}
}