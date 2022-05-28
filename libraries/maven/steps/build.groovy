void call(){
    stage('get_env') {
        node {
            sh 'echo hello'
            sh 'echo hey'
        }
    }
}

// void call(){
//     println "maven: build()"
// }