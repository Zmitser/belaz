$(document).ready(function () {

    function update() {
        var filteredGrid = '';
        var filteredList = '';
        $.ajax({
            type: "GET",
            url: '/user/ajax/truck-mining/filter',
            data: $('#filter').serialize(),
            success: function (data) {
                $.each(data, function(){
                    filteredGrid += '<div class="col-xs-12 col-sm-4 no-margin product-item-holder hover"><div class="product-item"><div class="ribbon red"><span>sale</span></div> <div class="image"> <a href="/single-product/'
                        + this.id+  '"> <img width="246" height="186" alt="'
                        + this.model.name +
                        '" src="/resources/assets/images/'
                        + this.photo[0].name
                        +'"> </a> </div> <div class="body"> <div class="title"> <a href="/single-product/'
                        + this.id +
                        '">' +
                        this.model.name +
                        '</a> </div> <div class="brand">' +
                        this.model.series.name +
                        '</div> </div> <div class="prices"> <div class="price-current pull-right">' +
                        this.price +
                        '</div> </div> <div class="hover-area"> <div class="add-cart-button"> ' +
                        '<a href="/shopping-cart/order-now/' + this.id + '" class="le-button">add to cart</a> </div> ' +
                        '<div class="wish-compare"> <a class="btn-add-to-wishlist" href="#">Добавить в избранные</a> ' +
                        '<a class="btn-add-to-compare" href="/compare/compare-this/' + this.id + '">Сравнить</a> </div> </div> </div><!-- /.product-item --> </div>';

                    filteredList +='<div class="product-item product-item-holder">' +
                        '<div class="ribbon red"><span>sale</span></div> ' +
                        '<div class="row"> ' +
                        '<div class="no-margin col-xs-12 col-sm-4 image-holder"> ' +
                        '<div class="image"> <a href="/single-product/' +
                        this.id + '"> ' +
                        '<img width="246" height="186" alt="' +
                        this.model.name + '" src="/resources/assets/images/' + this.photo[0].name +  '"> ' +
                        '</a> </div> </div><!-- /.image-holder --> ' +
                        '<div class="no-margin col-xs-12 col-sm-5 body-holder"> ' +
                        '<div class="body"> <div class="title"> ' +
                        '<a href="/single-product/' + this.id  + '">' + this.model.name + '</a> ' +
                        '</div> <div class="brand">' + this.model.series.name + '</div> <div class="excerpt"> ' +
                        '<p>' + this.application + '</p> ' +
                        '</div> <div class="addto-compare"> ' +
                        '<a class="btn-add-to-compare" href="/compare/compare-this/' + this.id + '">add to compare list</a> </div> </div> </div>' +
                        '<!-- /.body-holder --> <div class="no-margin col-xs-12 col-sm-3 price-area"> ' +
                        '<div class="right-clmn"> <div class="price-current">' + this.price + '</div> ' +
                        '<a class="le-button" href="/shopping-cart/order-now/' + this.id + '">add to cart</a> ' +
                        '<a class="btn-add-to-wishlist" href="#">add to wishlist</a> </div> </div><!-- /.price-area --> ' +
                        '</div><!-- /.row --> </div>'
                });
                $('.grid-no-margin').html(filteredGrid);
                $('.list-no-margin').html(filteredList);
            }
        });
    }

    $("#filter").submit(function () {
        update();
        return false;

    })


    
});
