<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<form class="form-horizontal">
	<input type="hidden" id="idID" name="id" /> 
	<input type="hidden" id="versionID" name="version" /> 
		           <div class="form-group">
                    <label class="col-lg-3 control-label">平台编号:</label>
	                    <div class="col-lg-9">
                           <input name="platformNo" style="display:inline; width:94%;" class="form-control"  type="text"  id="platformNoID" dataType="Require"/>
                           <span class="required">*</span>
			    </div>
	</div>
		           <div class="form-group">
                    <label class="col-lg-3 control-label">平台名称:</label>
	                    <div class="col-lg-9">
                           <input name="platformName" style="display:inline; width:94%;" class="form-control"  type="text"  id="platformNameID" dataType="Require"/>
                           <span class="required">*</span>
			    </div>
	</div>
			       <div class="form-group">
                    <label class="col-lg-3 control-label">平台分类:</label>
	                    <div class="col-lg-9">
	                    <div class="btn-group select" id="platformCategoryID"></div>
                           <input name="platformCategory" type="hidden"  id="platformCategoryID_" dataType="Require"/>
                           <span class="required">*</span>
			    </div>
	</div>
		           <div class="form-group">
                    <label class="col-lg-3 control-label">组装时间:</label>
	                 <div class="col-lg-9">
                    <div class="input-group date form_datetime" style="width:160px;float:left;" >
                        <input type="text" class="form-control" style="width:160px;" name="checkInTime" id="checkInTimeID" dataType="Require"/>
                        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span><span class="required">*</span></span>
                     </div>
			    </div>
	</div>
	</form>
<script type="text/javascript">
    var selectItems = {};
    var contents = [{title:'请选择', value: ''}];
    contents.push({title:'FT' , value: 'FT'});
    contents.push({title:'CP' , value: 'CP'});
    selectItems['platformCategoryID'] = contents;                                                                                                                          </script>
</body>
</html>