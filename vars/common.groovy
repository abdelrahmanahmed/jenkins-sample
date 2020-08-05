def call() {
 node {
        stage("Install Stage from common file") {
             if (env.BRANCH_NAME.equals('master')){
                   echo "npm install from common files master branch"
             }
             else if(env.BRANCH_NAME.equals('develop')){
                   echo "npm install from common files develop branch"
             }
        }
        stage("Test") {
            echo "npm test from common files"
        }
    }
}