pipelineJob('product-job') {
  definition {
    cps {
      script(readFileFromWorkspace('npm_pipeline.jenkinsfile'))
      sandbox()     
    }
  }
}