// 获取canvas元素和context
var canvas = document.getElementById('fireworks');
var ctx = canvas.getContext('2d');

// 设置canvas的宽度和高度
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

// 创建一个烟花数组
var fireworks = [];

// 创建一个烟花类
function Firework(x, y) {
    this.x = x;
    this.y = y;
    this.size = Math.random() * 5 + 1;
    this.shrink = Math.random() * 0.05 + 0.93;
    this.speed = Math.random() * 5 + 2;
    this.fuse = Math.random() * 10 + 80;
    this.startSize = this.size;

    this.update = function() {
        this.fuse--;
        this.y -= this.speed;
        this.size *= this.shrink;
        if(this.fuse <= 0) {
            this.explode();
        }
    };

    this.explode = function() {
        for(var i=0; i<50; i++) {
            particles.push(new Particle(this.x, this.y, Math.random() * 5 + 2));
        }
    };

    this.draw = function() {
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.size, 0, Math.PI * 2);
        ctx.fill();
    };
}

// 创建一个粒子类
function Particle(x, y, size) {
    this.x = x;
    this.y = y;
    this.size = size;

    this.update = function() {
        this.y += this.speed;
        this.size *= this.shrink;
    };

    this.draw = function() {
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.size, 0, Math.PI * 2);
        ctx.fill();
    };
}

// 创建一个动画循环
function animate() {
    requestAnimationFrame(animate);
    ctx.clearRect(0, 0, canvas.width, canvas.height);

    // 创建新的烟花
    if(Math.random() < 0.05) {
        fireworks.push(new Firework(Math.random() * canvas.width, canvas.height));
    }

    // 更新和绘制所有的烟花
    for(var i=0; i<fireworks.length; i++) {
        fireworks[i].update();
        fireworks[i].draw();
    }
}

// 开始动画循环
animate();