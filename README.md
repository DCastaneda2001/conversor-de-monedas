# Convertidor de Divisas

Este es un convertidor de divisas que utiliza datos en tiempo real de una API para realizar conversiones entre diferentes monedas.

## Características

- **Conversión en Tiempo Real:** Utiliza datos actualizados para asegurar precisiones en las conversiones.
- **Soporte para Múltiples Monedas:** Admite una amplia gama de monedas internacionales.
- **Interfaz Simple:** Fácil de usar con una interfaz de línea de comandos intuitiva.

## Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/DCastaneda2001/conversor-de-monedas.git
   cd conversor-de-divisas

2. Instala las dependencias:

   ```bash
   pip install -r requirements.txt

## Uso

1. Configura el entorno:

   - Instala la ultima versión de IntelilliJ
   - Ve a flie -> Project Structure -> Modules -> Dependencies
   - Da clic en Add (+)
   - Selecciona "gson-2.11.0.jar" en la carpeta "gson"
   - Y presiona "OK"

2. Configura la API:

   - Abre IntelilliJ
   - Ve a scr -> mx.dcastaneda -> requests -> ApiKey
   - Ingresa tu llave   
   ```bash
   API_KEY = 'tu_api_key'

3. Ejecuta el programa:

   - Ve a scr -> mx.dcastaneda -> principal -> Principal
   - Da clic en "Run"

## API Utilizada

Este proyecto utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener datos de conversión de divisas en tiempo real.

## Contribuciones

Las contribuciones son bienvenidas. Si tienes ideas para mejorar este proyecto, por favor crea un issue en GitHub o envía una pull request con tus cambios propuestos.

## Licencia

Distribuido bajo la licencia [GNU General Public License v3.0](https://github.com/DCastaneda2001/conversor-de-monedas/blob/main/LICENSE). Ver LICENSE para más información.
