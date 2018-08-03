<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container">
<div class="row">
	<div class="topMenu">
		<nav class="col-12">
			<ul>
				<li class= "bijoux col-md-2"> <a href="/LaPepite/shop">Bijoux</a> 
					<ul class= "submenu">
				         <li><a href="/LaPepite/shop/bague">Bagues</a></li>
				         <li><a href="/LaPepite/shop/collier">Colliers</a></li>
				         <li><a href="/LaPepite/shop/boucleoreille">Boucles d'oreilles</a></li>
				         <li><a href="/LaPepite/shop/bijouxargent">Bijoux Argent</a></li>
				         <li><a href="/LaPepite/shop/bijouxplaqueor">Bijoux Plaque Or</a></li>
				         <li><a href="/LaPepite/shop/bracelet">Bracelets </a></li>
				    </ul>
				</li>
				<li class= "createur col-md-2"> <a href="#">Cr�ateur</a> 
					<ul class= "submenu">
				         <li><a href="#">La Pepite</a></li>
				         <li><a href="#">Camille Enrico</a></li>
				         <li><a href="#">Collection Constance</a></li>
				         <li><a href="#">EOL</a></li>
				         <li><a href="#">Gwapita</a></li>
				         <li><a href="#">Judith Benita</a></li>
				         <li><a href="#">Laure Mory</a></li>
				         <li><a href="#">Sab and Sab</a></li>
				         <li><a href="#">Une part de Bonheur</a></li>
				         <li><a href="#">YAY You are Young</a></li>
				    </ul>
				</li>
				<li class="img col-md-4"> <a href="/LaPepite/home"><img src="/LaPepite/image/logoPepite.jpg" alt="Logo de LaPepite"></a> </li>
				<li class="col-md-2"> <a href="#">Contact</a> </li>
                                <li class="col-md-2"> <a href="/LaPepite/login"><i class="fa fa-users"> ${sessionScope.utilisateur.nom}</i></a> </li>
			</ul>
		</nav>
	</div>
</div>
    </div>

