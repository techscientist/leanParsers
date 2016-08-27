import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String type;
	public String name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String background_image;
	public String description;
	public String state;
	public CopyrightModel _copyright;
	public String topic;
	public String logo;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String organizer_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String end_time;
	public String timezone;
	public String email;
	public int id;
	public VersionModel _version;

	public RootModel(String location_name, String type, String name, String start_time, ArrayList<Social_linksModel> social_links, CreatorModel creator, String background_image, String description, String state, CopyrightModel copyright, String topic, String logo, String privacy, Call_for_papersModel call_for_papers, String organizer_description, String organizer_name, String code_of_conduct, String schedule_published_on, String end_time, String timezone, String email, int id, VersionModel version) {

		this.location_name = location_name;
		this.type = type;
		this.name = name;
		this.start_time = start_time;
		this.social_links = social_links;
		this._creator = creator;
		this.background_image = background_image;
		this.description = description;
		this.state = state;
		this._copyright = copyright;
		this.topic = topic;
		this.logo = logo;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.timezone = timezone;
		this.email = email;
		this.id = id;
		this._version = version;

	}

}