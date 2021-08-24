pipelineJob('product-job') {
  definition {
    cpsScm {
        scm {
            git('https://github.com/karolbogdanski/jenkins-exercise', 'upgrades', {node -> node / 'extensions' << '' })
            scriptPath("jobs/npm_pipeline.jenkinsfile")
            }

    }
  }
}