# MICRO SERVIÇO DE ANALISE DE DNA

O projeto foi desenvolvido com java 8, Banco de Dados h2 e spring boot com CLOUD na amazon EC2.

# VERIFICADOR DE DNA.

URL CLOUD : http://ec2-18-228-23-77.sa-east-1.compute.amazonaws.com:8080/mutant
URL LOCAL : http://localhost:8080/mutant
Body: {

   "dna":[
      "ATGCGA",
      "CAGTGC",
      "TTATGT",
      "AGAAGG",
      "CCCCTA",
      "TCACTG"
   ]
}

# End Point de porcetagem de Mutantes E humanos.

URL LOCAL: http:// 18.228.23.77:8080/stats
URL CLOUD :  http://ec2-18-228-23-77.sa-east-1.compute.amazonaws.com:8080/stats


# Para buildar o projeto ( Maven )

Executar o seguinte comando : clean package spring-boot:repackage


