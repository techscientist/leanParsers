import java.util.ArrayList;

class RootModel {

	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public VersionModel _version;
	public String timezone;
	public String schedule_published_on;
	public int id;
	public String privacy;
	public String organizer_name;
	public String logo;
	public String organizer_description;
	public String description;
	public String location_name;
	public String email;
	public String name;
	public String type;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String background_image;
	public CopyrightModel _copyright;
	public String end_time;
	public String state;

	public RootModel(String start_time, Call_for_papersModel call_for_papers, String code_of_conduct, VersionModel version, String timezone, String schedule_published_on, int id, String privacy, String organizer_name, String logo, String organizer_description, String description, String location_name, String email, String name, String type, CreatorModel creator, ArrayList<Social_linksModel> social_links, String topic, String background_image, CopyrightModel copyright, String end_time, String state) {

		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.description = description;
		this.location_name = location_name;
		this.email = email;
		this.name = name;
		this.type = type;
		this._creator = creator;
		this.social_links = social_links;
		this.topic = topic;
		this.background_image = background_image;
		this._copyright = copyright;
		this.end_time = end_time;
		this.state = state;

	}

}