Create Database DuAn1
go
Use DuAn1
go
--Màu Sắc
Create Table MauSac(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not  null
)
go
--Kích cỡ
Create Table KichCo(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not  null
)
go
--Chất liệu
Create Table ChatLieu(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not  null
)
go
--Danh Mục sản phẩm
Create Table DanhMucSP(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not null
)
go
--Thương hiệu
Create Table ThuongHieu(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not null
)
go
--Nhà sản xuất
Create Table NSX(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not null
)
go
--Chức vụ
Create Table ChucVu(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not null
)
go
--Khuyến mãi
Create Table KhuyenMai(
Id INT Identity(1,1) primary key,
Ten nvarchar(50) not null,
Ngaybatdau Date not null,
Ngayketthuc date not null,
HinhthucKM nvarchar(50) not null,
Giatrigiam decimal DEFAULT 0
)
go
--Chi tiết sản phẩm
Create Table ChitietSP(
Id INT Identity(1,1) PRIMARY KEY ,
Ma nvarchar(10) not  null,
Ten nvarchar(50) not null,
IdNsx INT foreign key references NSX(Id),
IdMauSac INT foreign key references MauSac(Id),
IdDMuc INT foreign key references DanhMucSP(Id),
IdKC INT foreign key references KichCo(Id),
IdCL INT foreign key references ChatLieu(Id),
IdTH INT foreign key references ThuongHieu(Id),
IdKM INT foreign key references KhuyenMai(Id),
MoTa NVARCHAR(50) DEFAULT NULL,
SoLuongTon INT,
GiaNhap DECIMAL(20,0) DEFAULT 0,
GiaBan DECIMAL(20,0) DEFAULT 0,
QrCode nvarchar(max) DEFAULT null
)
go
--User
Create Table Users(
Id INT Identity(1,1) PRIMARY KEY ,
Ten NVARCHAR(30) not null,
TenDem NVARCHAR(30) DEFAULT NULL,
Ho NVARCHAR(30) DEFAULT NULL,
NgaySinh DATE DEFAULT NULL,
Gioitinh bit null,
Sdt VARCHAR(30) DEFAULT NULL,
IdCV INT foreign key references ChucVu(Id),
TaiKhoan VARCHAR(MAX) DEFAULT NULL,
MatKhau VARCHAR(MAX) DEFAULT NULL,
Email varchar(max) not null,
TrangThai bit DEFAULT 0
)

--Khách hàng


---
go
Create Table KhachHang(
Id INT Identity(1,1) PRIMARY KEY ,
Ten NVARCHAR(30) not null,
TenDem NVARCHAR(30) DEFAULT NULL,
Ho NVARCHAR(30) DEFAULT NULL,
Gioitinh bit Null,
NgaySinh DATE DEFAULT NULL,
Email varchar(max) not null,
Sdt VARCHAR(30) DEFAULT NULL,
Diemthuong int DEFAULT NULL
)
go
--Hóa đơn
Create Table HoaDon(
Id INT Identity(1,1) primary key ,
IdKH INT foreign key references KhachHang(Id),
IdNV INT foreign key references Users(Id),
Ma VARCHAR(20) UNIQUE,
NgayTao DATE DEFAULT NULL,
NgayThanhToan DATE DEFAULT NULL,
TinhTrang bit DEFAULT 0
)
go
--Hóa đơn chi tiết
Create Table HoaDonChiTiet(
IdHD int foreign key references HoaDon(Id) not null,
IdCTSP int foreign key references ChitietSP(Id) not null,
Soluong int not  null,
Dongia decimal not  null,
primary key(IdHD,IdCTSP),
Dongiakhigiam decimal not  null
)
ALTER TABLE Hoadon

ADD Ghichu varchar(255)

insert into ThuongHieu values(N'CHÂU ÂU')
insert into ThuongHieu values(N'CHÂU PHI')
insert into ThuongHieu values(N'ARIDAT')

select * from ThuongHieu

insert into NSX values(N'Công Ty TNHH Sơn Tùng')
insert into NSX values(N'Công Ty TNHH Thiết Kế Thời Trang Tân Mỹ')
insert into NSX values(N'Công Ty TNHH ANMAC Việt Nam')

select * from NSX

insert into ChucVu values(N'nhân viên')
insert into ChucVu values(N'quản lý')

select * from ChucVu

insert into DanhMucSP values(N'GIÁ TRỊ CAO')
insert into DanhMucSP values(N'GIÁ TRỊ THẤP')
insert into DanhMucSP values(N'GIÁ TRỊ BÌNH THƯỜNG')

select * from DanhMucSP

insert into ChatLieu values(N'cattong')
insert into ChatLieu values(N'nỉ')
insert into ChatLieu values(N'giấy')

select * from ChatLieu

insert into KichCo values('sai30')
insert into KichCo values('sai31')
insert into KichCo values('sai32')

select * from KichCo

insert into MauSac values(N'MÀU ĐỎ')
insert into MauSac values(N'MÀU CAM')
insert into MauSac values(N'MÀU HỒNG')

SELECT * FROM MauSac

insert into KhachHang values(N'TOẢN ĐB',N'VĂN',N'NGUYỄN',0,'2003-05-05','toandbnvph25194@fpt.edu.vn','0968659481',null)
insert into KhachHang values(N'DUY ĐB',N'HỮU',N'NGUYỄN',0,'2003-10-23','duydbnvph25345@fpt.edu.vn','0968659481',null)

select * from KhachHang


insert into Users values(N'CHIẾN ĐB',N'VĂN',N'NGUYỄN','2003-05-05',0,'0968659481',null,N'CHIEN01','123456789','CHIENdbnvph25345@fpt.edu.vn',NULL)
insert into Users values(N'HUY ĐB',N'DUY',N'NGUYỄN','2003-05-06',0,'0968659481',null,N'HUY01','123456789','HUYdbnvph25345@fpt.edu.vn',NULL)

select * from Users


insert into HoaDon values(2,1,'1','2003-04-05','2003-02-05',0,null)
insert into HoaDon values(3,2,'2','2003-06-15','2003-06-15',0,null)

select * from HoaDon

insert into KhuyenMai values(N'toản','2003-04-05','2003-04-05','sale',0)
insert into KhuyenMai values(N'huy','2003-04-05','2003-04-05',N'kh cũ',1)

select * from KhuyenMai


insert into HoaDonChiTiet values(N'toản','2003-04-05','2003-04-05','sale',0)

select * from HoaDonChiTiet

