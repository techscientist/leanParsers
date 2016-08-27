import java.util.ArrayList;

class RootModel {

	public String timezone;
	public CreatorModel _creator;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String location_name;
	public String logo;
	public String organizer_name;
	public String name;
	public String description;
	public String privacy;
	public String end_time;
	public String background_image;
	public VersionModel _version;
	public int id;
	public String organizer_description;
	public String schedule_published_on;
	public String code_of_conduct;
	public String topic;
	public String start_time;
	public CopyrightModel _copyright;
	public String state;

	public RootModel(String timezone, CreatorModel creator, String type, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String email, String location_name, String logo, String organizer_name, String name, String description, String privacy, String end_time, String background_image, VersionModel version, int id, String organizer_description, String schedule_published_on, String code_of_conduct, String topic, String start_time, CopyrightModel copyright, String state) {

		this.timezone = timezone;
		this._creator = creator;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.email = email;
		this.location_name = location_name;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.name = name;
		this.description = description;
		this.privacy = privacy;
		this.end_time = end_time;
		this.background_image = background_image;
		this._version = version;
		this.id = id;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.start_time = start_time;
		this._copyright = copyright;
		this.state = state;

	}

}