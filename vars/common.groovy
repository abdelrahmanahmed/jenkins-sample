def call() {
 node {
        stage("Install") {
            echo "npm install from common files"
        }
        stage("Test") {
            echo "npm test from common files"
        }
    }
}