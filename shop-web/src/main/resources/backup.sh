# 备份furniture_shop数据库（重要）
/usr/local/mysql/bin/mysqldump -h 120.79.99.73 -p3306 -uroot -p123456 furniture_shop --opt -Q -R --skip-lock-tables> /data/mysql/backup/furniture_shop$(date +%Y%m%d_%H%M%S).sql

# 删除30天之前的数据
rm -rf $(find /data/mysql/backup/ -mtime +30 -name "*.sql")
rm -rf $(find /data/mysql/backup/ -mtime +30 -name "*.sql?")

# 导入furniture_shop最新数据到本地furniture_shop数据库
# mysql -uks -pwe6@dm1n < $(find /data/mysql/backup/furniture_shop/ -mtime -0.5 -name "*.sql")
