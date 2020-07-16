			Vue.component("mytable",{
				props:
				["titles","list","isremove","isupdate"],
				template:`
					<table class="table">
						<tr>
							<th v-for="t in titles">{{t}}</th>
							<th v-if="isremove || isupdate">操作</th>
						</tr>
						<tr v-for="item,index in list">
							<td v-for="data in item">{{data}}</td>
							<td v-if="isremove || isupdate">
								<span v-if="isremove" @click="remove(item,index)">删除</span>
								<span v-if="isupdate" @click="update(item)">修改</span>
							</td>
						</tr>
					</table>
				`,
				methods:{
					remove:function(item,index){
						this.$emit("remove",item,index);
					},
					update:function(item){
						this.$emit("update",item);
					}
				}
			});