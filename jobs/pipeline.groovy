pipelineJob('product-job') {
  definition {
    cps {
      script(readFileFromWorkspace('pipeline.jenkinsfile'))
      sandbox()     
    }
  }
}