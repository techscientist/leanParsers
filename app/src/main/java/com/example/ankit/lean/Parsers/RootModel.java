import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String end_time;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String start_time;
	public String schedule_published_on;
	public String location_name;
	public String timezone;
	public String privacy;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String description;
	public String code_of_conduct;
	public String organizer_description;
	public String email;
	public CreatorModel _creator;
	public String background_image;
	public String state;
	public CopyrightModel _copyright;
	public String logo;
	public VersionModel _version;

	public RootModel(String organizer_name, String end_time, String name, ArrayList<Social_linksModel> social_links, String type, String start_time, String schedule_published_on, String location_name, String timezone, String privacy, String topic, Call_for_papersModel call_for_papers, int id, String description, String code_of_conduct, String organizer_description, String email, CreatorModel creator, String background_image, String state, CopyrightModel copyright, String logo, VersionModel version) {

		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.name = name;
		this.social_links = social_links;
		this.type = type;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.email = email;
		this._creator = creator;
		this.background_image = background_image;
		this.state = state;
		this._copyright = copyright;
		this.logo = logo;
		this._version = version;

	}

}