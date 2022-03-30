
$(function() {
	$('#isEmpresa').change(function() {
		$('#empresaAtributo').hide();
		$('#' + $(this).val()).show();
	});
});