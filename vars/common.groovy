def call() {
    pipeline {
    agent any
    stages {
        stage('detect branch') {
            steps {
          script{
               if (env.BRANCH_NAME.equals('master') ){
                   
               echo "hello master from common file"
            }
            else if(env.BRANCH_NAME.equals('develop')){
              echo "hello develop"
            }
               }

        
          }
        }
    }
}
}