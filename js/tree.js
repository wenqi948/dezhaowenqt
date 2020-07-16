Vue.component('mytree',{
			template:`
			<div>
				<template v-for="(temp,i) in treed">
					<div>
						<a href="javaScript:void(0)" @click="doClick(temp.id)"><img src="../images/z-4.jpg" border="0">{{temp.name}}</a>
					</div>
					<div :id="temp.id" style="display:none;padding-left:15px;">
						<template v-for="(child,j) in temp.list">
							<img src="../images/z-top.gif">{{child.name}}<BR/>
						</template>
					</div>
				</template>
			</div>
			`,
			data(){
				return {};
			},
			methods:{
				doClick(i){
					this.$emit('getid',i);
				}
			},
			props:["treed"]
		});
		var tree=new Vue({
			el:"#tree",
			data:{
				treeData:[
					{
					   id:"1",
					   name:"java31",
					   list:[
					    {id:1, name:'李斯'},
					    {id:2, name:'嬴政'},
					    {id:3, name:'赵高'},
					    {id:4, name:'韩非'},
					    {id:5, name:'荀子'},
					   ],
					    isShow:false
					},
					{
					   id:"2",
					   name:"java30",
					   list:[
					    {id:1, name:'李斯1'},
					    {id:2, name:'嬴政1'},
					    {id:3, name:'赵高1'},
					    {id:4, name:'韩非1'},
					    {id:5, name:'荀子1'},
					   ],
					    isShow:false
					},
					{
					   id:"3",
					   name:".net27",
					   list:[
					    {id:1, name:'李斯2'},
					    {id:2, name:'嬴政2'},
					    {id:3, name:'赵高2'},
					    {id:4, name:'韩非2'},
					    {id:5, name:'荀子2'},
					   ],
					   isShow:false
					},
					{
					   id:"4",
					   name:".net28",
					   list:[
					    {id:1, name:'李斯3'},
					    {id:2, name:'嬴政3'},
					    {id:3, name:'赵高4'},
					    {id:4, name:'韩非5'},
					    {id:5, name:'荀子3'},
					   ],
					   isShow:false
					}
				]
			},
			methods:{
				handlerV(id){
					let bool=this.treeData[id-1].isShow;
					if(bool){
						$("#"+id).hide();
						this.treeData[id-1].isShow=false;
					}else{
						$("#"+id).show();
						this.treeData[id-1].isShow=true;
					}
				}
			}/* ,
			mounted(){
				console.log(this.treeData);
				//动态构建组件
				var myCom=Vue.extend({
					template:`<h1>动态生成组件</h1>`
				})
				//实例化组件
				var temp=new myCom();
				//挂载控件
				temp.$mount("#mycomm1");
			} */
		})