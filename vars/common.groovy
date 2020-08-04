def call() {
 node {
        stage("Install") {
            echo "npm install"
        }
        stage("Test") {
            echo "npm test"
        }
    }
}