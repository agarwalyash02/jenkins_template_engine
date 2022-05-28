void call(){
    stage('get_env') {
        steps {
            sh 'echo hello'
        }
    }
}

// void call(){
//     println "maven: build()"
// }