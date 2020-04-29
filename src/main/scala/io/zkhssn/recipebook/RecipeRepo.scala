package io.zkhssn.recipebook

class RecipeRepo(clientName: String, tableName: String) {

  def retrieveRecipe: Recipe = ???

  def retrieveRecipes: List[Recipe] = ???

  def addRecipe: Unit = ???

  def updateRecipe: Unit = ???

  def deleteRecipe = ???

}
