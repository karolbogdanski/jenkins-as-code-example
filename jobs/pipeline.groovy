pipelineJob('product-job') {
  definition {
    cps {
      script(readFileFromWorkspace('productPipeline.jenkinsfile'))
      sandbox()     
    }
  }
}