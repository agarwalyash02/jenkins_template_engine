void call(){
    stage('get_env') {
        node {
            sh 'echo hello'
        }
        node {
            sh 'echo hey'
        }
    }
}

// void call(){
//     println "maven: build()"
// }