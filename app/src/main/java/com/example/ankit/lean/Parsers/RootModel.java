import java.util.ArrayList;

class RootModel {

	public String type;
	public String end_time;
	public String email;
	public String name;
	public VersionModel _version;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String state;
	public int id;
	public String topic;
	public String description;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String privacy;
	public String schedule_published_on;
	public String timezone;
	public String organizer_name;
	public String location_name;
	public CreatorModel _creator;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;

	public RootModel(String type, String end_time, String email, String name, VersionModel version, String background_image, ArrayList<Social_linksModel> social_links, String logo, String state, int id, String topic, String description, String code_of_conduct, CopyrightModel copyright, String privacy, String schedule_published_on, String timezone, String organizer_name, String location_name, CreatorModel creator, String start_time, Call_for_papersModel call_for_papers, String organizer_description) {

		this.type = type;
		this.end_time = end_time;
		this.email = email;
		this.name = name;
		this._version = version;
		this.background_image = background_image;
		this.social_links = social_links;
		this.logo = logo;
		this.state = state;
		this.id = id;
		this.topic = topic;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._creator = creator;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;

	}

}