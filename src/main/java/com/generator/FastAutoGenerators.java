package com.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.zd.common.base.BaseController;
import com.zd.common.base.BaseModel;

public class FastAutoGenerators {
	
	public static void main(String[] args) {
		
	
		System.out.println("==========================START=============================");
		String projectPath = System.getProperty("user.dir");
		String author = "zdview";
		String parent = "com.zd.generator";
		String url = "jdbc:mysql://127.0.0.1:3306/mysql?useUnicode=true&serverTimezone=GMT&useSSL=false&characterEncoding=utf8";
		String username = "root";
		String password = "root";

		DataSourceConfig.Builder dataSourceConfig = new DataSourceConfig.Builder(url, username, password);

		FastAutoGenerator.create(dataSourceConfig)
				// 全局配置
				.globalConfig((scanner, builder) -> {
					builder
					//作者
					.author(author)
					//开启 swagger 模式
					.enableSwagger()
					//禁止打开输出目录
					.disableOpenDir()
					//输出目录
					.outputDir(projectPath + "/mybatis-generator/src/main/java")
					//覆盖已有文件
					.fileOverride()
					;
				})
				// 包配置
				.packageConfig((scanner, builder) -> {
					builder
					//指定父包名
					.parent(parent)
					;
				})
				// 策略配置
				.strategyConfig(builder -> {
					//开启跳过视图
					builder.enableSkipView();
					//控制器配置
					builder.controllerBuilder().enableRestStyle().superClass(BaseController.class);
					//实体配置
					builder.entityBuilder().superClass(BaseModel.class);
				})
				// 模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker .templateEngine(new BeetlTemplateEngine())
				.templateEngine(new FreemarkerTemplateEngine())
				// 自定义模板配置
				.templateConfig(builder->{
					builder
					//设置实体模板路径(JAVA)
					.entity("templates/entity.java")
					//设置mapper模板路径
					//.mapper(parent)
					//设置service模板路径
					//.service(parent)
					//设置serviceImpl模板路径
					//.serviceImpl("")
					//设置控制器模板路径
					//.controller(parent)
					;
					
				})
				.execute();

		System.out.println("==========================END=============================");
	}

}
