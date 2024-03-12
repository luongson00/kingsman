function confirmDelete(event) {
    if (confirm('Are you sure you want to delete this item?')) {
        // Nếu người dùng đồng ý, tiếp tục chuyển hướng hoặc thực hiện thao tác xóa ở đây
        return true;
    } else {
        // Nếu người dùng không đồng ý, hủy bỏ thao tác mặc định của nút
        event.preventDefault();
        return false;
    }
}