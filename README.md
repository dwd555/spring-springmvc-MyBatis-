记录遇到的坑<br />
1、Mybatis查询中文字符时查询不了数据，在连接mysql的url上添加?characterEncoding=utf8<br />
2、模糊查询可以在字符串自行拼接"%"+string+"%"<br />
3、mapper.xml最好放在resources目录下，不然执行打包命令时不会打包进去，会报Invalid bound statement (not found)错误<br />
4、@CrossOrigin(origins="*",maxAge=3600)//允许跨域<br />
