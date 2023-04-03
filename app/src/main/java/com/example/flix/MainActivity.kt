package com.example.flix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flix.databinding.ActivityMainBinding
import com.example.flix.databinding.FragmentTwoBinding
import com.example.flix.databinding.UsertabButtonBinding
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener{
    val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var customAdapter: CustomAdapter
    lateinit var tabTitleList: MutableList<String>
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.navigationView.setNavigationItemSelectedListener(this)

        customAdapter = CustomAdapter(this)
        customAdapter.addListFragment(OneFragment())
        customAdapter.addListFragment(TwoFragment())

        tabTitleList = mutableListOf("home", "New & Hot")
        binding.viewPager2.adapter = customAdapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.setCustomView(tabCustomView(position))
        }.attach()
        // 1. 액션바 대신에 툴바로 대체
        setSupportActionBar(binding.toolbar)
        // 2. ActionBarDrawerToggle 버튼 적용
        toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            R.string.drawer_open,
            R.string.drawer_close
        )
        // 3. 업버튼 활성화
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // 타이틀 이름 제거
        supportActionBar?.setDisplayShowTitleEnabled(false)
        // 4. 토글 sync
        toggle.syncState()

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    fun tabCustomView(position: Int): View {
        val binding = UsertabButtonBinding.inflate(layoutInflater)
        when (position) {
            0 -> binding.ivIcon.setImageResource(R.drawable.home)
            1 -> binding.ivIcon.setImageResource(R.drawable.whatshot)
        }
        binding.tvTabName.text = tabTitleList.get(position)
        return binding.root
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_like -> {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
            R.id.item_settings -> {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
            R.id.item_account -> {
                Toast.makeText(this, "준비 중", Toast.LENGTH_SHORT).show()
            }
            R.id.item_customer -> Toast.makeText(this, "준비 중", Toast.LENGTH_SHORT).show()
        }
        return false
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.navi_menu,menu)
        val searchMenuItem = menu?.findItem(R.id.search)
        val searchView = searchMenuItem?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{

            // 검색창에 검색글을 입력하고 엔터를 칠 때 콜백함수
            override fun onQueryTextSubmit(query: String?): Boolean {
                Toast.makeText(applicationContext,"${query}",Toast.LENGTH_SHORT).show()
                return true
            }
            // 검색창에 검색을 입력할 때마다 콜백발생
            override fun onQueryTextChange(newText: String?): Boolean {

                return true
            }

        })

        return super.onCreateOptionsMenu(menu)
    }

}