# ValidationUtil
This library using for validation on most of format such as email and other.

## Installing

We can install this library by using gradle

Step 1

```
allprojects {
	repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2

```
dependencies {
	        compile 'com.github.TuonBondol:ValidationUtil:1.0.6'
	}
```

## Sample Using

```
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isMatchPassword("a", "A")

        btnCheckEmail.setOnClickListener {
            if (etEmail.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (isValidEmail(etEmail.text.toString())) {
                Toast.makeText(this, "Email is Valid", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Email is Invalid", Toast.LENGTH_LONG).show()
        }
    }
}

```

## Min SDK Version

```
Support Min Sdk version >= 16

```

## Authors

* **Bondol Tuon** - [Bondol Tuon](https://github.com/BondolTuon)

See also the list of [contributors](https://github.com/BondolTuon/ValidationUtil/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md(https://github.com/BondolTuon/ValidationUtil/blob/master/README.md) file for details
