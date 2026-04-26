pipeline {
    agent any

    stages {
        stage('Clonar repositorio') {
            steps {
                echo 'Clonando repositorio...'
            }
        }

        stage('Verificar estructura') {
            steps {
                sh '''
                    echo "Comprobando carpetas..."
                    test -d app    && echo "OK app existe"    || echo "FALTA app"
                    test -d logica && echo "OK logica existe" || echo "FALTA logica"
                    test -d model  && echo "OK model existe"  || echo "FALTA model"
                    test -d test   && echo "OK test existe"   || echo "FALTA test"
                '''
            }
        }
    }

    post {
        success {
            echo 'Todo correcto'
        }
        failure {
            echo 'Algo ha fallado'
        }
    }
}