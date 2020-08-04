def call() {
    pipeline {
    agent any
        stage('detect branch') {
            steps {
          script{
               if (env.BRANCH_NAME.equals('master') ){
                   
               echo "hello master from common"
            }
            else if(env.BRANCH_NAME.equals('develop')){
              echo "hello develop"
            }
               }

        
          }
        }
        stage("Deploy") {
 echo "hello from common"
        }
    
}
}