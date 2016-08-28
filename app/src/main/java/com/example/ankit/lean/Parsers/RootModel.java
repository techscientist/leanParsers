import java.util.ArrayList;

class RootModel {

	public String start_time;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_description;
	public String state;
	public String email;
	public String end_time;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String description;
	public CopyrightModel _copyright;
	public String type;
	public String location_name;
	public String logo;
	public String topic;
	public String timezone;
	public String code_of_conduct;
	public String name;
	public String schedule_published_on;
	public String background_image;
	public VersionModel _version;

	public RootModel(String start_time, CreatorModel creator, ArrayList<Social_linksModel> social_links, String privacy, String organizer_description, String state, String email, String end_time, String organizer_name, Call_for_papersModel call_for_papers, int id, String description, CopyrightModel copyright, String type, String location_name, String logo, String topic, String timezone, String code_of_conduct, String name, String schedule_published_on, String background_image, VersionModel version) {

		this.start_time = start_time;
		this._creator = creator;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.state = state;
		this.email = email;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.description = description;
		this._copyright = copyright;
		this.type = type;
		this.location_name = location_name;
		this.logo = logo;
		this.topic = topic;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._version = version;

	}

}