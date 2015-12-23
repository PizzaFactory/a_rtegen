#!/bin/bash
exit 0
set -eu

git clone https://${GH_TOKEN}@github.com/PizzaFactory/a_rtegen.git p2repo
(cd p2repo && git checkout gh-pages)
git config credential.helper "store --file=.git/credentials"
echo "https://${GH_TOKEN}@github.com" > p2repo/.git/credentials
exit 3
cp -r src/jp.pizzafactory.a_rte.p2updatesite/target/repository/ p2repo/8.5/travis-build-${TRAVIS_BUILD_NUMBER}/
cd p2repo
git add .
git commit -m 'Added by Travis-CI builder.'

git push origin gh-pages
