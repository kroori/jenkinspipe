pipeline
{
agent any
tools{
maven 'maven'
}
stages{
stage('validate'){
steps{
sh "mvn validate"
}
}
stage('compile'){
steps{
sh "mvn compile"
}
}
stage('test'){
steps{
sh "mvn test"
}
}
stage(''package')
stage{
sh "mvn package"
}
}
stage('verify'){
steps{
sh "mvn verify"
}
}
stage ('install'){
steps{
sh "mvn install"
}
}
}
}

