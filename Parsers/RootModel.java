import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String topic;
	public String type;
	public String logo;
	public CreatorModel _creator;
	public String background_image;
	public String organizer_description;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String state;
	public String timezone;
	public String description;
	public VersionModel _version;
	public String privacy;
	public String end_time;
	public CopyrightModel _copyright;
	public int id;
	public String organizer_name;
	public String email;
	public String location_name;
	public String code_of_conduct;

	public RootModel(ArrayList<Social_linksModel> social_links, String schedule_published_on, String topic, String type, String logo, CreatorModel creator, String background_image, String organizer_description, String start_time, Call_for_papersModel call_for_papers, String name, String state, String timezone, String description, VersionModel version, String privacy, String end_time, CopyrightModel copyright, int id, String organizer_name, String email, String location_name, String code_of_conduct) {

		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.type = type;
		this.logo = logo;
		this._creator = creator;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.state = state;
		this.timezone = timezone;
		this.description = description;
		this._version = version;
		this.privacy = privacy;
		this.end_time = end_time;
		this._copyright = copyright;
		this.id = id;
		this.organizer_name = organizer_name;
		this.email = email;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;

	}

}