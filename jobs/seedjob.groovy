def giturl = 'https://github.com/KarolBogdanskiOfficial/react-tetris'

job('install-tetris') {
	scm {
		git(giturl)
	}
	steps {
		maven('-e clean test')
	}
}