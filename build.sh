#! /bin/sh

filelist=""
for soyfile in src/net/arunjitsingh/gsgae/templates/*.soy; do
  filelist="$filelist,$soyfile"
done
filelist=${filelist/,/}

java -jar bin/SoyParseInfoGenerator.jar \
  --outputDirectory src/net/arunjitsingh/gsgae/soy \
  --javaPackage net.arunjitsingh.gsgae.soy \
  --javaClassNameSource filename \
  --srcs $filelist
