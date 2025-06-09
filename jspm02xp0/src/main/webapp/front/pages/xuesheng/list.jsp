<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!-- 学生 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>学生</title>
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<body>

		<div id="app">
			<!-- 轮播图 -->
			<div class="layui-carousel" id="swiper">
				<div carousel-item id="swiper-item">
					<div v-for="(item,index) in swiperList" v-bind:key="index">
						<img class="swiper-item" :src="item.img">
					</div>
				</div>
			</div>
			<!-- 轮播图 -->

			<!-- 图文列表 -->
			<div class="data-container layui-row">
				<h2 class="index-title"> DATA SHOW </h2>
				<div class="line-container">
					<p class="line"> 学生展示 </p>
				</div>
				<fieldset class="search-container">
					<form class="layui-form">
						
                        
                                                                                                                                                                                                                        <div class="layui-inline" style="margin-bottom: 10px;">
							<label class="layui-form-label">性别</label>
							<div class="layui-input-inline">
								<input type="text" name="xingbie" id="xingbie" placeholder="性别" autocomplete="off" class="layui-input">
							</div>
						</div>   
                                                                                                                                                <div class="layui-inline" style="margin-bottom: 10px;">
							<label class="layui-form-label">学院</label>
							<div class="layui-input-inline">
								<input type="text" name="xueyuan" id="xueyuan" placeholder="学院" autocomplete="off" class="layui-input">
							</div>
						</div>   
                                                                                                <div class="layui-inline" style="margin-bottom: 10px;">
							<label class="layui-form-label">专业</label>
							<div class="layui-input-inline">
								<input type="text" name="zhuanye" id="zhuanye" placeholder="专业" autocomplete="off" class="layui-input">
							</div>
						</div>   
                                                                                                <div class="layui-inline" style="margin-bottom: 10px;">
							<label class="layui-form-label">年级</label>
							<div class="layui-input-inline">
								<input type="text" name="nianji" id="nianji" placeholder="年级" autocomplete="off" class="layui-input">
							</div>
						</div>   
                                                                                                <div class="layui-inline" style="margin-bottom: 10px;">
							<label class="layui-form-label">班级</label>
							<div class="layui-input-inline">
								<input type="text" name="banji" id="banji" placeholder="班级" autocomplete="off" class="layui-input">
							</div>
						</div>   
                                                                                                                                                                                                                                                                                                                                                                                                                        
						<div class="layui-inline" style="margin-left: 30px;margin-bottom: 10px;">
							<button id="btn-search" type="button" class="layui-btn">
								<i class="layui-icon layui-icon-search"></i> 搜索
							</button>
							<button v-if="isAuth('xuesheng','新增')" @click="jump('../xuesheng/add.jsp')" type="button" class="layui-btn btn-theme">
								<i class="layui-icon">&#xe654;</i> 添加
							</button>
						</div>
					</form>
				</fieldset>
				<div class="data-list layui-col-md8 layui-col-md-offset2">
					<div @click="jump('../xuesheng/detail.jsp?id='+item.id)" v-for="(item,index) in dataList" v-bind:key="index"
					 class="data-item layui-col-md3">
						
						                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                <img :src="item.zhaopian?item.zhaopian.split(',')[0]:''" class="cover">
                                                                                                                                                						
																																																																																																																																																																																																												
						<div v-if="item.price" class="data">
							<span class="item price">{{item.price}} RMB</span>
						</div>
					</div>
				</div>
				<div class="pager" id="pager"></div>
			</div>
			<!-- 图文列表 -->
		</div>


		<!-- layui -->
		<script src="../../layui/layui.js"></script>
		<!-- vue -->
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>
		<script>
			var vue = new Vue({
				el: '#app',
				data: {
					// 轮播图
					swiperList: [{
						img: '../../img/banner.jpg'
					}],
					dataList: []
				},
				methods: {
					isAuth(tablename, button) {
						return isFrontAuth(tablename, button)
					},
					jump(url) {
						jump(url)
					}
				}
			})

			layui.use(['layer', 'element', 'carousel', 'laypage', 'http', 'jquery'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var carousel = layui.carousel;
				var laypage = layui.laypage;
				var http = layui.http;
				var jquery = layui.jquery;

				var limit = 8;

				// 获取轮播图 数据
				http.request('config/list', 'get', {
					page: 1,
					limit: 5
				}, function(res) {
					if (res.data.list.length > 0) {
						var swiperItemHtml = '';
						for (let item of res.data.list) {
							if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
								swiperItemHtml +=
									'<div>' +
									'<img class="swiper-item" src="' + item.value + '">' +
									'</div>';
							}
						}
						jquery('#swiper-item').html(swiperItemHtml);
						// 轮播图
						carousel.render({
							elem: '#swiper',
							width: swiper.width,height:swiper.height,
							arrow: swiper.arrow,
							anim: swiper.anim,
							interval: swiper.interval,
							indicator: swiper.indicator
						});
					}
				});
				// 分页列表
				pageList();

				// 搜索按钮
				jquery('#btn-search').click(function(e) {
					pageList();
				});

				function pageList() {
					var param = {
						page: 1,
						limit: limit
					}
					
					                                                                                                                                                                if (jquery('#xingbie').val()) {
						param['xingbie'] = jquery('#xingbie').val() ? '%' + jquery('#xingbie').val() + '%' : '';
					}  
                                                                                                                        if (jquery('#xueyuan').val()) {
						param['xueyuan'] = jquery('#xueyuan').val() ? '%' + jquery('#xueyuan').val() + '%' : '';
					}  
                                                                                if (jquery('#zhuanye').val()) {
						param['zhuanye'] = jquery('#zhuanye').val() ? '%' + jquery('#zhuanye').val() + '%' : '';
					}  
                                                                                if (jquery('#nianji').val()) {
						param['nianji'] = jquery('#nianji').val() ? '%' + jquery('#nianji').val() + '%' : '';
					}  
                                                                                if (jquery('#banji').val()) {
						param['banji'] = jquery('#banji').val() ? '%' + jquery('#banji').val() + '%' : '';
					}  
                                                                                                                                                                                                                                                                                                                                                    
					// 获取列表数据
					http.request('xuesheng/list', 'get', param, function(res) {
						vue.dataList = res.data.list
						// 分页
						laypage.render({
							elem: 'pager',
							count: res.data.total,
							limit: limit,
							jump: function(obj, first) {
								//首次不执行
								if (!first) {
									http.request('xuesheng/list', 'get', param, function(res) {
										vue.dataList = res.data.list
									})
								}
							}
						});
					})
				}
			});
		</script>
	</body>
</html>
