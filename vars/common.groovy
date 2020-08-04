def call() {
 node {
        stage("Install Stage from common file") {
            echo "npm install from common files"
        }
        stage("Test") {
            echo "npm test from common files"
        }
    }
}