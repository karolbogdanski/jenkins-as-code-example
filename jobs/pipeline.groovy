pipelineJob('example-job-name') {
  definition {
    cpsScm {
        scm {
            // here we specify where the jenkins file is
            git("${path to a repo where jenkinsfile is}", "${example-branch-name}", {node -> node / 'extensions' << '' })
            scriptPath("jobs/example.jenkinsfile")
            }

    }
  }
}