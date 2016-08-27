import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String code_of_conduct;
	public String organizer_name;
	public String background_image;
	public String start_time;
	public CreatorModel _creator;
	public String topic;
	public String type;
	public String timezone;
	public int id;
	public String name;
	public String organizer_description;
	public String end_time;
	public String location_name;
	public String privacy;
	public String logo;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String state;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;

	public RootModel(String schedule_published_on, String code_of_conduct, String organizer_name, String background_image, String start_time, CreatorModel creator, String topic, String type, String timezone, int id, String name, String organizer_description, String end_time, String location_name, String privacy, String logo, String description, ArrayList<Social_linksModel> social_links, String email, String state, CopyrightModel copyright, Call_for_papersModel call_for_papers, VersionModel version) {

		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.start_time = start_time;
		this._creator = creator;
		this.topic = topic;
		this.type = type;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.location_name = location_name;
		this.privacy = privacy;
		this.logo = logo;
		this.description = description;
		this.social_links = social_links;
		this.email = email;
		this.state = state;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this._version = version;

	}

}