package app
import com.hr.*
class BootStrap {

    def init = { servletContext ->
        /*def usuarioRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
        def adminRole = Role.findByAuthority('ROLE_ADMIN') 

    	def adminUser = new User(
            username: 'admin',
            password: 'admin',
            enabled: true).save(failOnError: true)

        	if (!adminUser.authorities.contains(adminRole)) {
            	UserRole.create adminUser, adminRole	
        	}
    */}
    def destroy = {
    }
}
