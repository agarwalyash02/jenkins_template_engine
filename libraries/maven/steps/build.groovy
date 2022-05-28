void call(){
    stage('get_env') {
        node {
            sh 'echo hello'
        }
    }
}

// void call(){
//     println "maven: build()"
// }