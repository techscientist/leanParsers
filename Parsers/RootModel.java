import java.util.ArrayList;

class RootModel {

	public int id;
	public String location_name;
	public String background_image;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String name;
	public String timezone;
	public CopyrightModel _copyright;
	public String email;
	public String organizer_description;
	public String end_time;
	public String logo;
	public String schedule_published_on;
	public String state;
	public String organizer_name;
	public String privacy;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String type;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;

	public RootModel(int id, String location_name, String background_image, String topic, ArrayList<Social_linksModel> social_links, String description, String name, String timezone, CopyrightModel copyright, String email, String organizer_description, String end_time, String logo, String schedule_published_on, String state, String organizer_name, String privacy, CreatorModel creator, String code_of_conduct, String type, String start_time, Call_for_papersModel call_for_papers, VersionModel version) {

		this.id = id;
		this.location_name = location_name;
		this.background_image = background_image;
		this.topic = topic;
		this.social_links = social_links;
		this.description = description;
		this.name = name;
		this.timezone = timezone;
		this._copyright = copyright;
		this.email = email;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._version = version;

	}

}