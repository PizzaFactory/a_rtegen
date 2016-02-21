#!/usr/bin/env ruby

require "fileutils"

REPOSITORY_NAME="A-RTEGEN tuned by PizzaFactory Update Site"

def generate_content(base, dirs)
  FileUtils.mkdir_p("target/#{base}")
  f = File.open("target/#{base}/compositeContent.xml", 'w')
  f.print <<__END_CONTENT_HEADER
<?xml version='1.0' encoding='UTF-8'?>
<?compositeMetadataRepository version='1.0.0'?>
<repository name='#{REPOSITORY_NAME}'
  type='org.eclipse.equinox.internal.p2.metadata.repository.CompositeMetadataRepository'
  version='1.0.0'>
  <properties size='1'>
    <property name='p2.timestamp' value='#{Time.now.to_i}'/>
  </properties>
 <children size='#{dirs.length}'>
__END_CONTENT_HEADER
  dirs.each do |path| f.print <<__END_CONTENT_CHILDREN
    <child location='#{File.basename(path)}'/>
__END_CONTENT_CHILDREN
  end
  f.print <<__END_CONTENT_FOOTER
  </children>
</repository>
__END_CONTENT_FOOTER
end

def generate_artifacts(base, dirs)
  FileUtils.mkdir_p("target/#{base}")
  f = File.open("target/#{base}/compositeArtifacts.xml", 'w')
  f.print <<__END_ARTIFACTS_HEADER
<?xml version='1.0' encoding='UTF-8'?>
<?compositeArtifactRepository version='1.0.0'?>
<repository name='#{REPOSITORY_NAME}'
  type='org.eclipse.equinox.internal.p2.artifact.repository.CompositeArtifactRepository'
  version='1.0.0'>
  <properties size='1'>
    <property name='p2.timestamp' value='#{Time.now.to_i}'/>
  </properties>
 <children size='#{dirs.length}'>
__END_ARTIFACTS_HEADER
  dirs.each do |path| f.print <<__END_ARTIFACTS_CHILDREN
    <child location='#{File.basename(path)}'/>
__END_ARTIFACTS_CHILDREN
  end
  f.print <<__END_ARTIFACTS_FOOTER
  </children>
</repository>
__END_ARTIFACTS_FOOTER
end

def generate(base, dirs)
  generate_content(base, dirs)
  generate_artifacts(base, dirs)
end

def check(d)
  return if Dir.glob(d + '/*/content.*') == []
  generate(d, Dir.glob(d + '/*/'))
end

Dir.glob("p2repo/*").each do |d|
  check(d)
end
